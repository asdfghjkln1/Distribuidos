db.createUser(
 {
  user: "distri",
  pwd: "123",
  roles: [
   {
     role: "userAdmin",
     db: "form"
   }
  ]
 }
);
