import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './agp-menu.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';

class AgpBestellungenVerwalten extends PolymerElement {

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
 <vaadin-grid id="gridBestellungen"></vaadin-grid>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-bestellungen-verwalten';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpBestellungenVerwalten.is, AgpBestellungenVerwalten);
