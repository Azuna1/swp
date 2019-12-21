import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './agp-menu.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';

class AgpRechnungView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 10%; justify-content: center;">
 <agp-menu id="agpMenu" style="height: 10%;"></agp-menu>
</vaadin-horizontal-layout>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vaadin-horizontal-layout style="width: 80%; height: 15%; justify-content: flex-start; align-self: center;">
  <vaadin-vertical-layout style="align-items: flex-start;">
   <label style="width:200px;">Rechnungsnummer:</label>
   <label>Rechnungsdatum:</label>
   <label>Rechnungs Empfänger:</label>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout>
   <label id="textRechnungsNr">Label</label>
   <label id="textDatum">Label</label>
   <label id="textKunde">Label</label>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="width: 80%; height: 70%;">
  <vaadin-vertical-layout style="width: 100%; height: 100%;">
   <vaadin-grid id="vaadinGrid"></vaadin-grid>
   <vaadin-horizontal-layout style="justify-content: space-between; align-self: stretch;">
    <label style="font-weight: bold; width: 100px;">Bruto:</label>
    <label id="textBruto" style="align-self: flex-end;">Label</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: stretch; justify-content: space-between;">
    <label style="font-weight: bold; width: 100px;">Steuern:</label>
    <label id="textSteuern">Label</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout style="align-self: stretch; justify-content: space-between;">
    <label style="font-weight: bold; width: 100px;">Summe:</label>
    <label id="textSumme" style="font-weight: bold;">Label</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'agp-rechnung-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpRechnungView.is, AgpRechnungView);
