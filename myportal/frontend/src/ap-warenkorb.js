import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-grid/src/vaadin-grid-column.js';
import '@vaadin/vaadin-grid/src/vaadin-grid.js';

class ApWarenkorb extends PolymerElement {

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
<vaadin-grid items="[[items]]" style="position:relative;left:0px; top:-500px;" page-size="10">
 <vaadin-grid-column width="20%" flex-grow="0" header="Artikel"></vaadin-grid-column>
 <vaadin-grid-column width="20%" header="Anzahl"></vaadin-grid-column>
 <vaadin-grid-column width="20%" header="Einzelpreis"></vaadin-grid-column>
 <vaadin-grid-column width="20%" header="Gesamtpreis"></vaadin-grid-column>
 <vaadin-grid-column width="20%" header="Loeschen"></vaadin-grid-column>
</vaadin-grid>
<label style="position:relative; left:500px; top:-500px;">Endpreis: 
 <vaadin-button theme="primary" style="position:relative; left:-75px; top:50px;">
   Jetzt kaufen 
 </vaadin-button></label>
`;
    }

    static get is() {
        return 'ap-warenkorb';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(ApWarenkorb.is, ApWarenkorb);
