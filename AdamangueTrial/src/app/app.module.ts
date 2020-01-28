import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { RhPageComponent } from './rh-page/rh-page.component';
import { BusinessPageComponent } from './business-page/business-page.component';
import { StudentPageComponent } from './student-page/student-page.component';
import { FormateurPageComponent } from './formateur-page/formateur-page.component';
import { CandidatPageComponent } from './candidat-page/candidat-page.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    WelcomePageComponent,
    LoginPageComponent,
    RhPageComponent,
    BusinessPageComponent,
    StudentPageComponent,
    FormateurPageComponent,
    CandidatPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
