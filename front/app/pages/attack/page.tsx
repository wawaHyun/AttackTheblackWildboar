'use client'

import React from "react";

export default function Attack(){
    return(<>
   <section>
    <div className="mt-16 p-8  md:flex justify-around">
      <div
        className="mt-16 flex justify-between py-6 px-4 bg-white/30 rounded-lg shadow-lg shadow-indigo-500/40 hover:shadow-xl hover:shadow-blue-500/40"
      >
        <div className="flex items-center space-x-4 px-12">
          <div className="flex flex-col my-16 space-y-1">
            <span className="font-bold"
              >Dernière mise à jour : <span>il y a 6 heures</span>
            </span>
            <span className="text-sm"
              >Type de connexion : <span className="px-4"> WIFI </span>
            </span>
            <span className="text-sm"
              >Données transferer :
              <span className="px-4"> 10 kb</span>
            </span>
            <span className="text-sm"
              >Requête échouer :
              <span className="px-4"> 10</span>
            </span>
          </div>
        </div>
      </div>
      <div
        className="mt-16 flex justify-between py-6 px-4 bg-white/30 rounded-lg shadow-lg shadow-indigo-500/40 hover:shadow-xl hover:shadow-blue-500/40"
      >
        <div className="flex items-center space-x-4 px-12">
          <div className="flex flex-col my-16 space-y-1">
            <span className="font-bold"
              >Dernière mise à jour : <span>il y a 6 heures</span>
            </span>
            <span className="text-sm"
              >Type de connexion : <span className="px-4"> WIFI </span>
            </span>
            <span className="text-sm"
              >Données transferer :
              <span className="px-4"> 10 kb</span>
            </span>
            <span className="text-sm"
              >Requête échouer :
              <span className="px-4"> 10</span>
            </span>
          </div>
        </div>
      </div>
    </div>
  </section>
    </>)
}