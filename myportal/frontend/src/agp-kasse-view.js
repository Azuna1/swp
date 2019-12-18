import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './agp-menu.js';
import './agp-kasse.js';

class AgpKasseView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <agp-menu id="agpMenu" style="height:10%;"></agp-menu>
 <agp-kasse id="agpKasse" style="width:50%;"></agp-kasse>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-kasse-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpKasseView.is, AgpKasseView);
