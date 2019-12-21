import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './agp-menu.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class AgpShopView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout style="width: 100%; height: 10%; justify-content: center;">
 <agp-menu id="agpMenu" style="height:10%; flex-shrink: 0;"></agp-menu>
</vaadin-horizontal-layout>
<vaadin-horizontal-layout style="width: 100%; height: 5%; justify-content: space-evenly;">
 <vaadin-text-field placeholder="Suchen" id="textFieldSuchen">
  <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
 </vaadin-text-field>
 <vaadin-combo-box id="comboBoxFilter" placeholder="Filter"></vaadin-combo-box>
</vaadin-horizontal-layout>
<vaadin-vertical-layout id="layoutArtikel" style="width: 100%; height: 85%;" theme=""></vaadin-vertical-layout>
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
