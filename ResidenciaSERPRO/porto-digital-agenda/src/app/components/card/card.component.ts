import { Component, Input } from '@angular/core';
import { Contato } from '../../models/contato';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrl: './card.component.scss'
})
export class CardComponent {
  @Input() contato: Contato|null = null;
  nome: string= "Bárbara Ayres"
}
