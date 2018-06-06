import { Injectable } from '@angular/core';
import { User } from '../_models/user';
import { Museum } from '../_models';
import { Photo } from '../_models/photo';
import { PhotoService } from './photo.service';
/*import { WebService } from './web.service';*/
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  user;

  /* = [new User('Azura', 'Mamoto', 'azura.mamoto@yahoo.co.id', 'az12345', 'rue de tomjerry', 'mariazura'),
  new User('Capucine', 'Grazie', 'azura.mamoto@yahoo.co.id', 'az12345', 'rue de powerpuff', 'beesy_black'),
  new User('Azura', 'Mamoto', 'azura.mamoto@yahoo.co.id', 'ab123', 'rue de star', 'vitazura'),
  new User('Momo', 'Taro', 'azura.mamoto@yahoo.co.id', 'c123', 'rue de trek', 'marukochan'),
  new User('Huruhara', 'Holi', 'azura.mamoto@yahoo.co.id', 'qwerty345', 'rue de dauphin', 'moonlightyellow'),
  new User('Carola', 'Coila', 'azura.mamoto@yahoo.co.id', 'azerty1', 'rue de hamster', 'busybee'),
  new User('Holis', 'Molis', 'azura.mamoto@yahoo.co.id', 'abcdef55', 'rue de figaro', 'marukochan')];
  */

  constructor(private http: HttpClient) { }

  private usersurl = 'http://localhost:8080/user';
  public getUsers(): Observable<User[]> {
    return this.http.get<User[]>(this.usersurl + 's');
  }
getUserById(id: number): Observable<User> {
      return this.http.get<User>(this.usersurl + '/' + id);
    }

}
