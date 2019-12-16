import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';

class ApMenu extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content">
 <vaadin-button theme="tertiary" style="width:20%;  height: 50px;font-size: 12.5px;">
   Shop 
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:20%;  height: 50px;font-size: 12.5px;">
   Warenkorb 
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:20%; height: 50px; font-size: 12.5px;">
   Bestellungen Verwalten 
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:20%;  height: 50px;font-size: 12.5px;" tabindex="">
   Kasse 
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:20%;  height: 50px;font-size: 12.5px;" tabindex="">
   Logout 
 </vaadin-button>
</vaadin-horizontal-layout>
<vaadin-combo-box style="padding: 10px 16px; width:150px">
  Filter 
</vaadin-combo-box>
<vaadin-text-field placeholder="Search">
 <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
</vaadin-text-field>
`;
    }

    static get is() {
        return 'ap-menu';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(ApMenu.is, ApMenu);
