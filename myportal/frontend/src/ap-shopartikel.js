import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class ApShopartikel extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content">
 <vaadin-button theme="tertiary" style="width:20%;  height: 50px;font-size: 12.5px;border: 2px solid #008CBA;">
  Shop
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:20%;  height: 50px;font-size: 12.5px;border: 2px solid #008CBA;">
  Warenkorb
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:22%;  height: 50px;font-size: 12.5px;border: 2px solid #008CBA;">
  Bestellungen Verwalten
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:20%;  height: 50px;font-size: 12.5px;border: 2px solid #008CBA;">
  Kasse
 </vaadin-button>
 <vaadin-button theme="tertiary" style="width:20%;  height: 50px;font-size: 12.5px;border: 2px solid #008CBA;">
  Logout
 </vaadin-button>
</vaadin-horizontal-layout>
<label style="position:relative; left:350px; top:50px;">Artikelname</label>
<label style="position:relative; left:260px; top:130px;">Preis</label>
<vaadin-button theme="primary" style="position:relative; left:225px; top:225px;">
 in den Warenkorb
</vaadin-button>
`;
    }

    static get is() {
        return 'ap-shopartikel';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(ApShopartikel.is, ApShopartikel);
