import { Injectable } from '@angular/core';
import { Photo } from '../_models/photo';
import { UserService } from './user.service';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PhotoService {
  photo;
  /* photos = new Array<Photo>(new Photo('louvre.jpg', ' The Louvre ', 'Canon EOS M3', '50mm', 'f/6.0', '1/60', 'no', 3200, 9,
     'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
     this.userService.getUserById(0).username),
     new Photo('louvre1.jpg', ' The Louvre ', 'Sony AX10', '50mm', 'f/5.0', '1/60', 'no', 600, 8,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(1).username),
     new Photo('louvre2.jpg', ' The Louvre ', 'Canon EM1', '40mm', 'f/6.0', '1/100', 'no', 100, 6,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(2).username),
     new Photo('louvre3.jpg', ' The Louvre ', 'Sony AX20', '60mm', 'f/7.0', '1/60', 'no', 400, 7,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('mamvp.jpg', ' M A M V P ', 'Canon EOS M3', '50mm', 'f/6.0', '1/60', 'no', 3200, 9,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(4).username),
     new Photo('mamvp1.jpg', ' M A M V P ', 'Sony DS10', '50mm', 'f/5.0', '1/60', 'no', 600, 8,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(5).username),
     new Photo('mamvp2.jpg', ' M A M V P ', 'Canon EM5', '40mm', 'f/6.0', '1/100', 'no', 100, 6,
       'lots of collection and museum is so big', ' the receptionist was not friendly and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('mamvp3.jpg', ' Musée d\'Art Moderne de la Ville de Paris ', 'Fuji AX100', '60mm', 'f/7.0', '1/60', 'no', 400, 7),
     new Photo('histoireNat.jpg', ' Museum Natural History ', 'Canon EOS M3', '50mm', 'f/6.0', '1/60', 'no', 3200, 9,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('histoireNat1.jpg', ' Museum Natural History ', 'Sony DS10', '50mm', 'f/5.0', '1/60', 'no', 600, 8,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('histoireNat2.jpg', ' Museum Natural History ', 'Canon EM5', '40mm', 'f/6.0', '1/100', 'no', 100, 6,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('histoireNat3.jpg', ' Museum Natural History ', 'Fuji AX100', '60mm', 'f/7.0', '1/60', 'no', 400, 7,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('orsay.jpg', ' Musée d\'Orsay ', 'Canon EOS M3', '50mm', 'f/6.0', '1/60', 'no', 3200, 9,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('orsay1.jpg', ' Musée d\'Orsay ', 'Sony DS10', '50mm', 'f/5.0', '1/60', 'no', 600, 8,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('orsay2.jpg', ' Musée d\'Orsay ', 'Canon EM5', '40mm', 'f/6.0', '1/100', 'no', 100, 6,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('orsay3.jpg', ' Musée d\'Orsay ', 'Fuji AX100', '60mm', 'f/7.0', '1/60', 'no', 400, 7,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('orange.jpg', ' Musée de l\'Orangerie ', 'Canon EOS M3', '50mm', 'f/6.0', '1/60', 'no', 3200, 9,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('orange1.jpg', ' Musée de l\'Orangerie ', 'Sony DS10', '50mm', 'f/5.0', '1/60', 'no', 600, 8,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('orange2.jpg', ' Musée de l\'Orangerie ', 'Canon EM5', '40mm', 'f/6.0', '1/100', 'no', 100, 6,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection', 'vitazura'),
     new Photo('orange3.jpg', ' Musée de l\'Orangerie ', 'Fuji AX100', '60mm', 'f/7.0', '1/60', 'no', 400, 7,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('flv.jpg', ' Foundation LV ', 'Nikon D5000', '70mm', 'f/4.0', '1/30', 'no', 3200, 8,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('flv1.jpg', ' Foundation LV ', 'Pentax QS1', '60mm', 'f/3.0', '1/40', 'no', 1600, 7,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('flv2.jpg', ' Foundation LV ', 'Pentax K1', '100mm', 'f/3.0', '1/40', 'no', 200, 6,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username),
     new Photo('flv3.jpg', ' Foundation LV ', 'Olympus M II ', '60mm', 'f/3.0', '1/40', 'no', 800, 9,
       'lots of collection and museum is so big', ' long queue and need time to discover all the collection',
       this.userService.getUserById(3).username));
 */
  constructor(private userService: UserService, private http: HttpClient) { }

  private photourl = 'http://localhost:8080/photo';

  public getPhotos(): Observable<Photo[]> {
    return this.http.get<Photo[]>(this.photourl + 's');
  }
  getPhotoById(id: number): Observable<Photo> {
    return this.http.get<Photo>(this.photourl + '/' + id);
  }
  /*
    getPhotoById(id: number) {
      return this.photos.filter(p => p.identification === id)[0];
    }
    getPhotosByIds(ids: number[]) {
      const photos = new Array<Photo>();
      for (const i of ids) {
        photos.push(this.getPhotoById(+i));
      }
      return photos;
    }
    /* getPhotosByIds(ids: number[]) {
       const ret = new Array<Photo>();
       for (let n of ids) {
         ret.push(this.getPhotosById(n));
       ;
       }
      return this.photos.filter(p => p.identification === id)[0];
    }*/
}
