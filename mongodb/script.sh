echo 'Creating user and db'

mongo admin \
	-u $MONGO_INITDB_ROOT_USERNAME \
	-p $MONGO_INITDB_ROOT_PASSWORD \
	--eval "db.getSiblingDB('$MONGO_DATABASE').createUser({user: '$DATABASE_USERNAME}', pwd: '$DATABASE_PASSWORD', roles: [{role: 'dbOwner', db: '$MONGO_DATABASE'}]});"

echo 'MONGO INITALIZATION FINISHED!!!!!!!!!'
