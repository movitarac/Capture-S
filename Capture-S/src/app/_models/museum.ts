export class Museum {
    static count = 0;
    public id = 0;
    public name: string;
    public city: string;
    constructor(name = '', city = '') {
        this.id = Museum.count++;
        this.name = name;
        this.city = city;
    }
}
