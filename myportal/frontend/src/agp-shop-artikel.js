import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
 <vaadin-horizontal-layout style="height:100%;">
  <vaadin-vertical-layout style="width:110px; padding-left: 5px;" theme="spacing">
   <label>Name:</label>
   <label>Preis:</label>
   <label>Kategorie:</label>
   <label>Beschreibung:</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="width: 120px;padding-left: 5px;" theme="spacing">
   <label id="textName">Label</label>
   <label id="textPreis">Label</label>
   <label id="textKategorie">Label</label>
   <label id="textBeschreibung" theme="">Label</label>
  </vaadin-vertical-layout>
  <div id="imageContainer">
   <img style="height:100px; width:100px; padding-top:5px;" src="https://interactive-examples.mdn.mozilla.net/media/examples/grapefruit-slice-332-332.jpg" theme="">
  </div>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="justify-content: space-evenly;width:100%">
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
