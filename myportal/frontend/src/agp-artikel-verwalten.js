import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';

class AgpArtikelVerwalten extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <vaadin-button theme="tertiary" id="buttonSuchen">
   Suchen
  </vaadin-button>
  <vaadin-button theme="tertiary" id="buttonFiltern">
   Filtern
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-grid id="gridArtikel"></vaadin-grid>
 <vaadin-button theme="tertiary" id="buttonBearbeiten">
  Bearbeiten
 </vaadin-button>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-artikel-verwalten';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpArtikelVerwalten.is, AgpArtikelVerwalten);
