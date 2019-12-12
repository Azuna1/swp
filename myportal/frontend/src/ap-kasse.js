import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class ApKasse extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;">
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
<label style="position:relative; left:107px; top:-375px;">Artikelliste:</label>
<label style="position:relative; left:25px; top:-475px;">Rechnungsnummer:</label>
<label style="position:relative; left:-123px; top:-407px;">Name:</label>
<label style="position:relative; left:-172px; top:-440px;">Matrikelnummer:</label>
`;
    }

    static get is() {
        return 'ap-kasse';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(ApKasse.is, ApKasse);
