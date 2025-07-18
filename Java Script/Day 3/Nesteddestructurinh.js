const users = [
    {
    userid : 1,
    user_name: "Ritesh",
    gender : "male"},
    {
    userid : 2,
    user_name: "Om",
    gender : "male"},
    {
    userid : 3,
    user_name: "shiv",
    gender : "male"},

]

const[,{gender:user3_gender},{user_name : user1_username,userid}] = users;
console.log(user1_username);
console.log(user3_gender);
console.log(userid);