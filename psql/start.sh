#!/bin/bash
psql -U postgres postgres -f psql/db_create.sql
psql -U postgres postgres -d preinst -f psql/db_create_table.sql
