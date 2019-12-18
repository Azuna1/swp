import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './agp-warenkorb.js';
import './agp-menu.js';

class AgpWarenkorbView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <agp-menu id="agpMenu"></agp-menu>
 <agp-warenkorb id="agpWarenkorb" style="width:100%;"></agp-warenkorb>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-warenkorb-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpWarenkorbView.is, AgpWarenkorbView);
