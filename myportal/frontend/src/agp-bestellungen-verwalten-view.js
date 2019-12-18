import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './agp-menu.js';
import './agp-bestellungen-verwalten.js';

class AgpBestellungenVerwaltenView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <agp-menu id="agpMenu" style="height:10%;"></agp-menu>
 <agp-bestellungen-verwalten id="agpBestellungenVerwalten" style="width:70%;"></agp-bestellungen-verwalten>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-bestellungen-verwalten-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpBestellungenVerwaltenView.is, AgpBestellungenVerwaltenView);
