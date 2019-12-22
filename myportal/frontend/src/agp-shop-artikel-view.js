import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import './agp-menu.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class AgpShopArtikelView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout style="width: 100%; height: 20%; justify-content: center;">
 <agp-menu id="agpMenu" style="height:10%;"></agp-menu>
</vaadin-horizontal-layout>
<vaadin-horizontal-layout style="width:100%; justify-content: center;">
 <vaadin-horizontal-layout style="width: 90%; height: 80%;">
  <vaadin-vertical-layout style="width:100%;">
   <vaadin-horizontal-layout style="width:100%; height:100%; justify-content: center;">
    <vaadin-vertical-layout style="width: 200px;">
     <label>Name:</label>
     <label>Preis:</label>
     <label>Kategorie:</label>
     <label>Beschreibung:</label>
     <vaadin-button theme="primary" id="buttonWarenkorb">
       In den Warenkorb 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout style="padding-left:15px;">
     <label id="textName">Label</label>
     <label id="textPreis">Label</label>
     <label id="textKategorie">Label</label>
     <label id="textBeschreibung" style="max-width:500px;">Labela adsa das dad asdasd aasd asd asd asd asd asd asd asd asd a asd assd ads asd asd asd asd asd asd asd asd asd asd asd asd asd asd asd asd asd asd asd asd asd asd asd a asd ads asd </label>
    </vaadin-vertical-layout>
    <img style="padding-left:15px;" src="https://interactive-examples.mdn.mozilla.net/media/examples/grapefruit-slice-332-332.jpg">
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'agp-shop-artikel-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(AgpShopArtikelView.is, AgpShopArtikelView);
