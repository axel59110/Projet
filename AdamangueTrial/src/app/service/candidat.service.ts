import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';
@Injectable({providedIn: 'root' })
export class CandidatService {
  candidats: any[] = [];
  URL = 'http://localhost:8080/apiAdamangue';
  constructor(private http: HttpClient) {

  }

  save(candidat: any) {
    return this.http.post(this.URL + '/save', candidat, { observe: 'response' });
  }

}
