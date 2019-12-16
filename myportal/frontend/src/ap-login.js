import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VaDesign extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; ">
 <vaadin-text-field label="Username" placeholder="Username" style="  padding: 19px 20px;
  margin: 100px 10px;
  box-sizing: border-box;
"></vaadin-text-field>
 <vaadin-password-field label="Passwort" placeholder="Enter password" value="secret1" style=" padding: 19px 20px;
  margin: -100px 10px;
  box-sizing: border-box;"></vaadin-password-field>
 <vaadin-button theme="primary" style="padding: 6px 40px;   margin: 120px 50px;  box-sizing: border-box;">
   Login 
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'va-design';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VaDesign.is, VaDesign);
