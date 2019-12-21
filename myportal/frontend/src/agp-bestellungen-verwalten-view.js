import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './agp-menu.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class AgpBestellungenVerwaltenView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout style="width: 100%; height: 10%; justify-content: center;">
 <agp-menu id="agpMenu" style="height:10%;"></agp-menu>
</vaadin-horizontal-layout>
<vaadin-horizontal-layout style="width: 100%; height: 90%; justify-content: center;">
 <vaadin-vertical-layout style="width:70%; height: 90%; flex-shrink: 0;">
  <vaadin-horizontal-layout style="width: 100%;; justify-content: space-between;">
   <label style="align-self: flex-end;">Rechnungen:</label>
   <vaadin-text-field placeholder="Search" id="textFieldSearch">
    <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
   </vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-grid style="border: 1px solid;" id="vaadinGrid"></vaadin-grid>
  <vaadin-horizontal-layout style="align-self: flex-end;">
   <vaadin-button id="buttonBezahlt">
    <iron-icon icon="lumo:checkmark" slot="prefix"></iron-icon>Als Bezahlt Markieren 
   </vaadin-button>
   <vaadin-button id="buttonDetails">
    <iron-icon icon="lumo:eye" slot="prefix"></iron-icon>Details 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
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
