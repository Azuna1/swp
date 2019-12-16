import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './agp-menu.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class AgpWarenkorb extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <agp-menu id="agpMenu"></agp-menu>
 <vaadin-grid id="vaadinGrid"></vaadin-grid>
 <label id="labelGesamtPreis">Gesamtpreis:</label>
 <vaadin-button theme="tertiary" id="buttonKaufen">
  Jetzt kaufen
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-warenkorb';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpWarenkorb.is, AgpWarenkorb);
