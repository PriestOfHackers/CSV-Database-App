import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UploadButtonComponent } from './upload-button/upload-button.component';
import { UploadTableComponent } from './upload-table/upload-table.component';
import { HeaderComponent  } from './header/header.component';



@NgModule({
  declarations: [
    AppComponent,
    UploadButtonComponent,
    UploadTableComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
