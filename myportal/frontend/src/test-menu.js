import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-menu-bar/src/vaadin-menu-bar.js';

class TestMenu extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-menu-bar id="vaadinMenuBar"></vaadin-menu-bar>
`;
    }

    static get is() {
        return 'test-menu';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(TestMenu.is, TestMenu);
