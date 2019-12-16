import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-menu-bar/src/vaadin-menu-bar.js';

class AgpMenu extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-menu-bar id="vaadinMenuBar" style="width:100%;height:10%;"></vaadin-menu-bar>
`;
    }

    static get is() {
        return 'agp-menu';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpMenu.is, AgpMenu);
