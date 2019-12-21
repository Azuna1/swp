import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class AgpShopArtikel extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
                :host([hidden]) {
  					display: none !important;
				}
            </style>
<vaadin-vertical-layout style="width:350px; height: 300px; border:1px dotted hsl(214, 90%, 52%);">
 <vaadin-horizontal-layout style="width: 90%; height: 20%;" theme="margin">
  <label style="width:120px;">Name:</label>
  <label id="textName" style="width:200px; height: 30px;">Label</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 90%; height: 20%;" theme="margin">
  <label style="width:120px">Preis:</label>
  <label id="textPreis" style="width:200px; height: 30px;">Label</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 90%; height: 20%;" theme="margin">
  <label style="width:120px">Beschreibung:</label>
  <label id="textBeschreibung" style="width:200px; height: 30px;">Label</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 90%; height: 20%;" theme="margin">
  <label style="width: 120px;">Kategorie:</label>
  <label id="textKategorie" style="width:200px; height: 30px;">Label</label>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 100%; height: 100%; justify-content: space-evenly;">
  <vaadin-button theme="primary" id="buttonWarenkorb" style="flex-shrink: 0; width 100%; align-self: center;">
    Zum Warenkorb Hinzufügen 
  </vaadin-button>
  <vaadin-button theme="primary" id="buttonDetail" style="align-self: center;">
    Details 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-shop-artikel';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpShopArtikel.is, AgpShopArtikel);
