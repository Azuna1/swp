import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './agp-login.js';

class AgpLoginView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout style="width: 100%; height: 100%; justify-content: center;">
 <agp-login id="agpLogin"></agp-login>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'agp-login-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpLoginView.is, AgpLoginView);
