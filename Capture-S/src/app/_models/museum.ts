import { Photo } from './photo';

export class Museum {
    static count = 0;
    public id = 0;
    public name: string;
    public city: string;
    public type: string;
    public tarif: number;
    public addressm: string;
    public openHours: string;
    public photo: Array<Photo>;
    public lat: number;
    public longi: number;
    constructor(name = '', city = '', addressm = '', type = '', openHours = '', tarif = 0, photo?, lat?, longi?) {
        this.id = Museum.count++;
        this.name = name;
        this.city = city;
        this.type = type;
        this.openHours = openHours;
        this.addressm = addressm;
        this.tarif = tarif;
        this.photo = photo;
        this.lat = lat;
        this.longi = longi;
    }
}
