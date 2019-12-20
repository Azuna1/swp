import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './agp-menu.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class AgpWarenkorbView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout style="width: 100%; height: 10%; justify-content: center;">
 <agp-menu id="agpMenu" style="height: 10%;"></agp-menu>
</vaadin-horizontal-layout>
<vaadin-horizontal-layout style="width: 100%; height: 100%; justify-content: center;">
 <vaadin-vertical-layout style="width: 70%; height: 80%; align-items: center;" id="vaadinVerticalLayout" theme="margin">
  <label style="align-self: flex-start;">Warenkorb:</label>
  <vaadin-grid id="vaadinGrid" style="border: solid 1px;"></vaadin-grid>
  <vaadin-horizontal-layout style="justify-content: space-between; width: 100%;">
   <div>
    <label style="width:100px;" theme="">Summe:</label>
    <label id="textSumme">Label</label>
   </div>
   <vaadin-horizontal-layout style="height: 100%; justify-content: space-between; width: 280px;">
    <vaadin-button theme="primary" id="buttonRemoveArtikel">
     Artikel Entfernen
    </vaadin-button>
    <vaadin-button theme="primary" id="buttonKaufen">
      Jetzt Kaufen 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
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
