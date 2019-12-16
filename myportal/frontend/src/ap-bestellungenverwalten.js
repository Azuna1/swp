<<<<<<< HEAD
import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';
import '@vaadin/vaadin-grid/src/vaadin-grid-column.js';

class VaBestellungenverwalten extends PolymerElement {

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
<vaadin-grid items="[[items]]" style="position:relative;left:0px; top:-500px">
 <vaadin-grid-column width="25%" header="Rechnungsnummer"></vaadin-grid-column>
 <vaadin-grid-column width="25%" header="Datum"></vaadin-grid-column>
 <vaadin-grid-column width="25%" header="Preis"></vaadin-grid-column>
 <vaadin-grid-column width="25%" header="Status"></vaadin-grid-column>
</vaadin-grid>
`;
    }

    static get is() {
        return 'va-bestellungenverwalten';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VaBestellungenverwalten.is, VaBestellungenverwalten);
=======
import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

class VaBestellungenverwalten extends PolymerElement {

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
<vaadin-text-field label="Label" placeholder="Placeholder"></vaadin-text-field>
`;
    }

    static get is() {
        return 'va-bestellungenverwalten';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VaBestellungenverwalten.is, VaBestellungenverwalten);
>>>>>>> c7e410e265b6510fddbdd03c70538118932821f5
