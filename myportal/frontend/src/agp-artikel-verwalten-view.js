import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './agp-menu.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';
import '@vaadin/vaadin-grid/src/vaadin-grid-column.js';

class AgpArtikelVerwaltenView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout style="width: 100%; height: 10%; justify-content: center;">
 <agp-menu id="agpMenu" style="height: 10%; flex-shrink: 0;"></agp-menu>
</vaadin-horizontal-layout>
<vaadin-horizontal-layout style="width: 100%; height: 90%; justify-content: center;">
 <vaadin-vertical-layout style="flex-shrink: 0; width:70%; height:90%;">
  <vaadin-horizontal-layout style="justify-content: space-between; width:100%; flex-shrink: 0;">
   <label style="align-self: flex-end;">Artikel:</label>
   <vaadin-text-field placeholder="Search">
    <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
   </vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-grid style="border: 1px solid;">
   <vaadin-grid-column></vaadin-grid-column>
   <vaadin-grid-column></vaadin-grid-column>
  </vaadin-grid>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
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
