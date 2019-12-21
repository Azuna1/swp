import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './agp-menu.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class AgpArtikelBearbeitenView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout style="width: 100%; height: 10%; justify-content: center;">
 <agp-menu style="height:10%;"></agp-menu>
</vaadin-horizontal-layout>
<vaadin-horizontal-layout style="width: 100%; height: 100%; justify-content: center;">
 <vaadin-vertical-layout>
  <vaadin-text-field label="" placeholder="Artikelname" id="textFieldName" style="width: 250px;"></vaadin-text-field>
  <vaadin-combo-box id="comboBoxKategorie" style="width: 250px;" placeholder="Kategorie"></vaadin-combo-box>
  <vaadin-combo-box id="comboBoxAnzahl" style="width: 250px;" placeholder="Anzahl"></vaadin-combo-box>
  <vaadin-text-field label="" placeholder="Preis" id="textFieldPreis" style="width: 250px;"></vaadin-text-field>
  <vaadin-text-area label="Artikelbeschreibung" placeholder="Add detailed explanation" id="textAreaBeschreibung" style="width: 250px;"></vaadin-text-area>
  <vaadin-horizontal-layout style="width: 250px; height: 100%; justify-content: space-evenly;">
   <vaadin-button theme="primary" id="buttonSpeichern">
    Speichern
   </vaadin-button>
   <vaadin-button theme="primary" id="buttonLoeschen">
    Löschen
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'agp-artikel-bearbeiten-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpArtikelBearbeitenView.is, AgpArtikelBearbeitenView);
