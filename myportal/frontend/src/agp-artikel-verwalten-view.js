import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './agp-menu.js';
import './agp-artikel-verwalten.js';

class AgpArtikelVerwaltenView extends PolymerElement {

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
 <agp-artikel-verwalten id="agpArtikelVerwalten" style="width:50%;"></agp-artikel-verwalten>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-artikel-verwalten-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpArtikelVerwaltenView.is, AgpArtikelVerwaltenView);
