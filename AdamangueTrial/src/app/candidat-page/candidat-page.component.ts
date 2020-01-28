import { CandidatService } from '../service/candidat.service';
import { SharedService } from '../service/shared.service';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-candidat-page',
  templateUrl: './candidat-page.component.html',
  styleUrls: ['./candidat-page.component.css']
})
export class CandidatPageComponent implements OnInit {

  form: FormGroup;
  mode: any;
  // tslint:disable-next-line:max-line-length
  constructor(private candidatService: CandidatService, private activatedRoute: ActivatedRoute, private sharedService: SharedService, private router: Router) { }

  ngOnInit() {
    this.mode = this.sharedService.editMode;
    this.form = new FormGroup({
      nom: new FormControl(null, Validators.required),
      prenom: new FormControl(null, Validators.required),
      email: new FormControl(null, Validators.required),
      tel: new FormControl(null, Validators.required),
      cv: new FormControl(null, Validators.required),
      lettreMotivation: new FormControl(null, Validators.required)
    });
  }
  envoyerCandidature() {
    this.candidatService.save(this.form.value).subscribe(response => {
      this.candidatService.candidats.push(response.body);
      this.form.reset();
    });
  }
}


