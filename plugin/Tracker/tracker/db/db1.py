from trac.db import Table, Column, Index, DatabaseManager

tables = [
    Table('tracker_screenshots', key='id')[
        Column('id', type='integer', auto_increment=True),
        Column('filename'),
        Column('author'),
        Column('path'),
        Column('time', type='integer')
    ]
]


def do_upgrade(env, cursor):
    db_connector, _ = DatabaseManager(env)._get_connector()

    # Create tables
    for table in tables:
        for statement in db_connector.to_sql(table):
            cursor.execute(statement)

    #set database schema version
    cursor.execute("INSERT INTO system "
                   "(name, value) "
                   "VALUES ('tracker', '1')")
