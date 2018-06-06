export class User {
    static count = 0;
    public identification = 0;
    public firstName: string;
    public lastName: string;
    public email: string;
    public password: string;
    public address: string;
    public username: string;
    constructor(firstName = '', lastName = '', email = '', password = '', address = '',
        username = '') {
        this.identification = User.count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.username = username;
    }
    /*constructor(nameP = '') {
        this.nameP = nameP;
    }*/
}
