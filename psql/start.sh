#!/bin/bash
psql -U postgres postgres -f db_create.sql
psql -U postgres postgres -d preinst -f db_create_table.sql
