import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './agp-menu.js';

class AgpKasse extends PolymerElement {

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
 <label id="labelRechnungsnummer">Rechnungsnummer:</label>
 <label id="labelMatrikelnummer">Matrikelnummer:</label>
 <label id="labelName">Name:</label>
 <label id="labelArtikelliste">Artikelliste:</label>
 <vaadin-grid id="gridArtikelliste"></vaadin-grid>
 <label id="labelGesamtpreis">Gesamtpreis:</label>
 <vaadin-button theme="tertiary" id="buttonBestellen">
  Verbindlich bestellen
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-kasse';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpKasse.is, AgpKasse);
