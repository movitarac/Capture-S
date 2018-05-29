export class Photo {
    static count = 0;
    public identification = 0;
    public nameP: string;
    public photoTitle: string;
    public cameraBrand: string;
    public focal: string;
    public apeture: string;
    public isoCam: number;
    public shutterSpeed: string;
    public flash: string;
    public star: string;
    public museumId: number;
    public reviewPos: string;
    public reviewNeg: string;
    public username: string;
    constructor(nameP = '', photoTitle = '', cameraBrand = '', focal = '',
    apeture = '', shutterSpeed = '', flash = '', isoCam?, star?, reviewPos?, reviewNeg?, username?) {
        this.identification = Photo.count++;
        this.nameP = nameP;
        this.photoTitle = photoTitle;
        this.cameraBrand = cameraBrand;
        this.focal = focal;
        this.apeture = apeture;
        this.isoCam = isoCam;
        this.shutterSpeed = shutterSpeed;
        this.flash = flash;
        this.star = star;
        this.reviewPos = reviewPos;
        this.reviewNeg = reviewNeg;
        this.username = username;
    }
    /*constructor(nameP = '') {
        this.nameP = nameP;
    }*/
}
