import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './agp-menu.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './agp-artikel-erstellen.js';

class AgpArtikelErstellenView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout style="width: 100%; height: 10%; justify-content: center;">
 <agp-menu id="agpMenu" style="height:10%;"></agp-menu>
</vaadin-horizontal-layout>
<vaadin-horizontal-layout style="width: 100%; height: 100%; justify-content: center;">
 <agp-artikel-erstellen id="agpArtikelErstellen"></agp-artikel-erstellen>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'agp-artikel-erstellen-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpArtikelErstellenView.is, AgpArtikelErstellenView);
