import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EducacionService {
URL:'http://localhost:8080/educacion/'

  constructor(private http: HttpClient) { }

  public getEducacion(): Observable<educacion>{
    return this.http.get<educacion>(this.URL + 'traer/perfil');
    
  }
}
