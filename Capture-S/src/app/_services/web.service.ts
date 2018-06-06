import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Museum } from '../_models';
import { Photo } from '../_models/photo';
import { User } from '../_models/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WebService {
  constructor(private http: HttpClient) { }
 liste: string;

  private url = 'http://localhost:8080/';

  public getAll(liste): Observable<any> {
      return this.http.get(this.url + liste);
  }

  /*
    public getAllUsers() {
      return this.http.get<User[]>(this.usersurl);
    }

    public getAllMuseums() {
      return this.http.get<Museum[]>(this.museumsurl);
    }

    public getAllPhotos() {
      return this.http.get<Photo[]>(this.photossurl);
    }
    */
}
