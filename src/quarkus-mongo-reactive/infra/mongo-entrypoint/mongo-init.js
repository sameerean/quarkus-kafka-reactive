
//var databases = ['qmrappdb','anotherdb'];
//
//for (var i = databases.length - 1; i >= 0; i--) {
//  db = db.getSiblingDB(databases[i])
//
//  db.createUser({
//    user: "root",
//    pwd: "password",
//    roles: ["readWrite"]
//  })
//}

db.createUser ({
	user: "qmrapp",
	pwd: "qmrpass123",
	roles: [
		{
			role: "readWrite",
			db: "qmrappdb"
		}
	]
})
qmrappdb = db.getSiblingDB('qmrappdb')

qmrappdb.fruit.createIndex( { "name": 1 }, { unique: true } )