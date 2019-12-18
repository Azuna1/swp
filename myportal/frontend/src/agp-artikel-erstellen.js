import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class AgpArtikelErstellen extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-text-field label="" placeholder="Artikelname" id="textFieldArtikelname"></vaadin-text-field>
 <vaadin-combo-box id="comboBoxKategorie" placeholder="Kategorie"></vaadin-combo-box>
 <vaadin-combo-box id="comboBoxAnzahl" placeholder="Anzahl"></vaadin-combo-box>
 <vaadin-text-field label="" placeholder="Preis" id="textFieldPreis"></vaadin-text-field>
 <vaadin-text-area label="Artikelbeschreibung" id="textAreaArtikelbeschreibung"></vaadin-text-area>
 <vaadin-button theme="tertiary" id="buttonSpeichern">
   Speichern 
 </vaadin-button>
 <vaadin-button theme="tertiary" id="buttonLoeschen">
   Loeschen 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-artikel-erstellen';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpArtikelErstellen.is, AgpArtikelErstellen);
