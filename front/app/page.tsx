import { useRouter } from "next/navigation";
import React from "react";
import { useState } from "react";

export default function Home() {
  // const [username, setUsername] = useState('')
  // const [password, setPassword] = useState('')

  // const handleUsername = (e: any) => {
  //   setUsername(e.target.value)
  // }
  // const handlePassword = (e: any) => {
  //   setPassword(e.target.value)
  // }
  // alert(username+" "+password)


  return (
    <div className="flex justify-between w-48 mt-5 text-xs text-gray-400">
      ID : <input type="text"
        className=" rounded-lg appearance-none border
     border-black w-500 py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2
      focus:ring-purple-600 focus:border-transparent"/>
      PW : <input type="text" />
      <button type="button"
        className="relative after:absolute after:content-[''] after:w-px after:h-2.5 after:top-1 
    after:left-32 after:bg-gray-300">아이디/비밀번호 찾기</button>

{/* ID : <input type="text" onChange={handleUsername}
        className=" rounded-lg appearance-none border
     border-black w-500 py-2 px-4 bg-white text-gray-700 placeholder-gray-400 shadow-sm text-base focus:outline-none focus:ring-2
      focus:ring-purple-600 focus:border-transparent"/>
      PW : <input type="text" onChange={handlePassword} />
      <button type="button"
        className="relative after:absolute after:content-[''] after:w-px after:h-2.5 after:top-1 
    after:left-32 after:bg-gray-300">아이디/비밀번호 찾기</button> */}

      <button type="button" ref={"./join"}>회원가입</button>
    </div>
  );
}
