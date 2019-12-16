import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './agp-menu.js';

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
 <vaadin-combo-box id="vaadinComboBox"></vaadin-combo-box>
 <vaadin-text-field placeholder="Search" id="vaadinTextField">
  <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
 </vaadin-text-field>
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
