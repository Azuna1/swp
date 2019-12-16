import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-menu-bar/src/vaadin-menu-bar.js';

class AgpMenuAdmin extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-menu-bar id="vaadinMenuBarAdmin"></vaadin-menu-bar>
`;
    }

    static get is() {
        return 'agp-menu-admin';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpMenuAdmin.is, AgpMenuAdmin);
