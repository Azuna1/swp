import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-split-layout/src/vaadin-split-layout.js';

class AgpShopListe extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-split-layout id="vaadinSplitLayout1">
  <label id="labelName">Name:</label>
  <label id="labelNameWert">Wert</label>
 </vaadin-split-layout>
 <vaadin-split-layout id="vaadinSplitLayout2">
  <label id="labelPreis">Preis</label>
  <label id="labelPreisWert">Wert</label>
 </vaadin-split-layout>
 <vaadin-split-layout id="vaadinSplitLayout3">
  <label id="labelBeschreibung">Beschreibung</label>
  <label id="labelBeschreibungWert">Wert</label>
 </vaadin-split-layout>
 <vaadin-button theme="tertiary" id="buttonDetails">
  Details
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-shop-liste';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpShopListe.is, AgpShopListe);
