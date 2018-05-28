import { Photo } from './photo';

export class Museum {
    static count = 0;
    public id = 0;
    public name: string;
    public city: string;
    public type: string;
    public tarif: number;
    public address: string;
    public openHours: string;
    public photo: Array<Photo>;
    constructor(name = '', city = '', address = '', type = '', openHours = '', tarif = 0, photo?) {
        this.id = Museum.count++;
        this.name = name;
        this.city = city;
        this.type = type;
        this.openHours = openHours;
        this.address = address;
        this.tarif = tarif;
        this.photo = photo;
    }
}
