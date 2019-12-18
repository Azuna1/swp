import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './agp-menu.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import './agp-shop-liste.js';

class AgpShopView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout id="vaadinVerticalLayout" style="width: 100%; height: 100%;">
 <agp-menu id="agpMenu" style="width:100%;height:10%;"></agp-menu>
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <vaadin-text-field placeholder="Suchen" id="textFieldSuchen">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-combo-box id="comboBoxFilter" placeholder="Filter"></vaadin-combo-box>
 </vaadin-horizontal-layout>
 <agp-shop-liste id="agpShopListe"></agp-shop-liste>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-shop-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpShopView.is, AgpShopView);
